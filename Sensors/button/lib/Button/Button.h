#ifndef BUTTON_H
#define BUTTON_H

class Button
{
public:
    Button(int pin, bool buttonDown);
    void setup(long startTime);
    void update(long now);
    bool GetButtonState();

private:
    enum ButtonState
    {
        Off,
        Push,
        On,
        Release
    };
    const static long _noiseCancelTimer = 10;
    int _pin;
    bool _buttonDown;
    ButtonState _buttonState;
    long _nextChangeTime;
};

#endif // BUTTON_H