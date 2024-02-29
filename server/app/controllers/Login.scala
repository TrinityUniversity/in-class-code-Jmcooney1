package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class Login @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def login = Action{
    Ok(views.html.login1())
  }
  def valdiateLoginGet(name:String,favcolor:String) = Action{
    Ok(s"$name favorite color is $favcolor")
  }
  

}