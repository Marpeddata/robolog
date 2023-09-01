#include <Arduino.h>
#include <Button.h>

// put function declarations here:
int count = 0;
int buttonPin = D1;
bool _prevButtonState = false;
//int buttonPin = D8;
// D8 is used by the boot mode process, most of the boards have this pun puled down by an external resistor, which is sronger than internal weak pullup.

Button myButton(buttonPin, LOW);


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  // pinMode(buttonPin, INPUT_PULLUP);
  myButton.setup(millis());

}

void loop() {
// if(digitalRead(buttonPin) == LOW) {
//   Serial.println(count);
//   count++;
//   delay(10); // Compensate for noise when clicking the physical button. 
//   while (digitalRead(buttonPin) == LOW) 
//   {
//   }
//   delay(10); // Compensate for noise when releasing the physical button. 
//   {

long now = millis();
myButton.update(now);
if(_prevButtonState != myButton.GetButtonState())
{
  _prevButtonState = myButton.GetButtonState();
  if(_prevButtonState)
  {
    count++;
    Serial.println(count);
  }
}

}

// put function definitions here:
