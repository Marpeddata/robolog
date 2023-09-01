#include <Arduino.h>


int trigger = D0;
int echo = D1;
long microsecondsToInches(long);
long microsecondsToCentimeters(long);


void setup() {
 pinMode(echo, INPUT);
 pinMode(trigger, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  
  long duration, inches, cm;
   
   digitalWrite(trigger, LOW);
   delayMicroseconds(2);
   digitalWrite(trigger, HIGH);
   delayMicroseconds(10);
   digitalWrite(trigger, LOW);
   duration = pulseIn(echo, HIGH);
  
   inches = microsecondsToInches(duration);
   cm = microsecondsToCentimeters(duration);
   Serial.print(inches);
   Serial.print("in, ");
   Serial.print(cm);
   Serial.print("cm");
   Serial.println();
   delay(100);
}


long microsecondsToInches(long microseconds) {
   return microseconds / 74 / 2;
}

long microsecondsToCentimeters(long microseconds) {
   return microseconds / 29 / 2;
}