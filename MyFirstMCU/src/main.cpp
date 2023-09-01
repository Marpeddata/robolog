#include <Arduino.h>
// #include "SimpleLED.h"

// SimpleLED led1(LED_BUILTIN, false, 100, 400);
// SimpleLED led2(LED_BUILTIN_AUX, false, 100, 300);
// long stateTime [8] = {0, 0, 0, 0, 0, 0, 0, 0};

// void setup()
// {
//   // put your setup code here, to run once:
//   long start = millis();
//   led1.setup(start);
//   led2.setup(start);
// }

// void loop()
// {
//   // put your main code here, to run repeatedly:
//   // HIGH or 1 = off
//   // LOW or 0 = on
//   long now = millis();
//   led1.update(now);
//   led2.update(now);
// }

int redPin = D3;
int yellowPin = D1;
int greenPin = D2;

void setup()
{
  pinMode(redPin, OUTPUT);
  pinMode(yellowPin, OUTPUT);
  pinMode(greenPin, OUTPUT);
}

void loop()
{
  digitalWrite(redPin, LOW);
  digitalWrite(greenPin, HIGH);
  delay(100);
  digitalWrite(greenPin, LOW);
  digitalWrite(yellowPin, HIGH);
  delay(100);
  digitalWrite(yellowPin, LOW);
  digitalWrite(redPin, HIGH);
  delay(100);
}
