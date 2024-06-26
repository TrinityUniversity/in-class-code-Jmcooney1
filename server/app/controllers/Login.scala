package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class Login @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def login = Action{
    Ok(views.html.login2())
  }
  def valdiateLogin1Get(name:String,favcolor:String) = Action{
    Ok(s"$name favorite color is $favcolor")
  }

  def valdiateLogin2Post(username:String) = Action{ request => 
    val postVals = request.body.asFormUrlEncoded
    postVals.map {args =>
      val username = args("username").head
    Redirect(routes.TaskList1.GroupTask1())
    }.getOrElse(Redirect(routes.TaskList1.login2()))
  }
  
  def tasklist = Action{
    val tasks = List("task1","task2","task3","sleep","eat")
    Ok(views.html.taskList1.tasklist)
  }

}