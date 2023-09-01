#include "Arduino.h"
#include "Button.h"

Button::Button(int pin, bool buttonDown) : _pin(pin), _buttonDown(buttonDown) {}
void Button::setup(long startTime)
{
    pinMode(_pin, INPUT_PULLUP);
}
void Button::update(long now)
{
    switch (_buttonState)
    {
    case Off:
        if (digitalRead(_pin) != _buttonDown)
            return;
        {
            _buttonState = Push;
            _nextChangeTime = now + _noiseCancelTimer;
            break;
        }
    case Push:
        if (now < _nextChangeTime)
            return;
        _buttonState = On;
        break;
    case On:
        if (digitalRead(_pin) == _buttonDown)
            return;
        _buttonState = Release;
        _nextChangeTime = now + _noiseCancelTimer;
        break;
    case Release:
        if (now < _nextChangeTime)
            return;
        _buttonState = Off;
        break;
    }
}

bool Button::GetButtonState()
{
    return _buttonState == On || _buttonState == Push;
}