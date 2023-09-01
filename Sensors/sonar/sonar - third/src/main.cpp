#include <Arduino.h>

#include <NewPing.h>

// Define the pins for trigger and echo
#define TRIGGER_PIN  D6
#define ECHO_PIN     D5

// Maximum distance to measure (in cm)
#define MAX_DISTANCE 200

// Create a NewPing object with the trigger and echo pins
NewPing sonar(TRIGGER_PIN, ECHO_PIN, MAX_DISTANCE);

void setup() {
  Serial.begin(9600);
}

void loop() {
  delay(50); // Wait between measurements for stability

  // Send a ping and get the duration of the echo
  unsigned int duration = sonar.ping_median();

  // Calculate distance in centimeters
  // Speed of sound is approximately 29 microseconds per centimeter
  // Divide by 2 for the time it takes to travel to the object and back
  int distance_cm = duration / 29 / 2;

  // Print the distance to the Serial Monitor
  Serial.print("Distance: ");
  Serial.print(distance_cm);
  Serial.println(" cm");
}