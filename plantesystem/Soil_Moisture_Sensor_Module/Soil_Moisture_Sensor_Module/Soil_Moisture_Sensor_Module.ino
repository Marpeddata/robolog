/*

  Soil Moisture Sensor Module

  Parts required:
  - Arduino Board
  - Soil Moisture Sensor Module

  Programming by : René Rasmussen
  Website : www.it-teknolog.dk
  Contact : renerasmussen@it-teknolog.dk
  Date : 18 Dec 2019
  Version : v1.0

  Modulet kan købes på www.arduinotech.dk

*/

const int capture_D = 2;                          // set capture_D as Digital Port D2
const int capture_A = A1;                         // set capture_A as Analog Port A1

int val_analogique;                               // set val_analogique   

void setup()
{
  pinMode(capture_D, INPUT);                      // set pinMode for Capture_D to INPUT
  pinMode(capture_A, INPUT);                      // set pinMode for Capture_A to INPUT
  Serial.begin(9600);                             // start Serial Monitor
}

void loop()
{
  if (digitalRead(capture_D) == LOW)              // read capture_D if LOW do
  {
    Serial.println("Plant dont need water...");   // print Digital value : Plant dont need water... to Serial Monitor
    delay(10);                                    // wait 10ms
  }
  else
  {
    Serial.println("Plant need water...");        // print Digital value : Plant need water... to Serial Monitor 
    delay(10);                                    // wait 10ms
  }
  val_analogique = analogRead(capture_A);         // read capture_A to val_analogique
  Serial.print("Analog value : ");                // print Analog value : to Serial Monitor
  Serial.println(val_analogique);                 // print value of val_analogique to Serial Monitor
  Serial.println("");                             // print newline ti Serial Monitor
  delay(1000);                                    // wait 1 sec
}
