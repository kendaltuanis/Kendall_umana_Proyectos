const int Led_Rojo=13;
const int Led_Amarillo=12;
int Byte_entrada;


void setup(){
  Serial.begin(9600); // Abre el puerto serie
  pinMode(Led_Rojo, OUTPUT);
  pinMode(Led_Amarillo, OUTPUT);
  digitalWrite(Led_Rojo, LOW);
  digitalWrite(Led_Amarillo, LOW);
}

void loop(){

if(Serial.available()>0){
Byte_entrada=Serial.read(); // leemos lo que transmitiremos desde java
if(Byte_entrada=='0'){
digitalWrite(Led_Amarillo, LOW);}
else if (Byte_entrada=='1'){
digitalWrite(Led_Amarillo, HIGH);
}
else if(Byte_entrada=='2'){
digitalWrite(Led_Rojo, LOW);
}
else if(Byte_entrada=='3'){
digitalWrite(Led_Rojo, HIGH);
}

}

}


