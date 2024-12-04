#Author: Kevin Abdiel Gonzalez
#language: es

@Escenario1
Característica:  Validar Modulos del CSI OnPremise

 Yo como usuario quiero ingresar a la pagina web de csi on premise y validar los modulos

@Login
Escenario: Iniciar sesion con credenciales validas
  Dado que me encuentro en la pagina de inicio de sesion del CSI
  Cuando ingrese mis credenciales
  Y haga clic en el boton Entrar
  Entonces valido que aparezca la pantalla del home de CSI




Escenario: Recuperar contraseña mediante correo
  Dado que este en la pagina de ayuda
  Cuando ingrese user y email
  Y haga click en el boton de enviar
  Entonces se debe mostrar una alerta que se envio el correo de restablecimiento


