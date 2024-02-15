package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class groupTask1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok("It works")
  }

}