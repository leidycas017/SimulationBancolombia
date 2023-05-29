 #Language: en

 Feature: Pagar una cuota para un credito que tengo pendiente
   como usuario del sistema quiero iniciar sesion
   para pagar una cuota de un credito que tengo pendiente

   Scenario: Iniciar sesion para consultar y pagar un credito
     Given que he ingresado el usuario y contrasena
     When presiono el boton ingresar
     And presiono el boton pagar de uno de los creditos pendientes
     And puedo ingresar el valor a pagar
     And presiono el boton pagar
     Then puedo ver la cantidad de cuotas pagas y restantes
