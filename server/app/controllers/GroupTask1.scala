package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class groupTask1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def taskList = Action {
    Ok(views.html.groupTask1("We in task1 group"))
  }

}