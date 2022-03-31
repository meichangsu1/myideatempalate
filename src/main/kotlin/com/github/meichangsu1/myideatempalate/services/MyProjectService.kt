package com.github.meichangsu1.myideatempalate.services

import com.intellij.openapi.project.Project
import com.github.meichangsu1.myideatempalate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
