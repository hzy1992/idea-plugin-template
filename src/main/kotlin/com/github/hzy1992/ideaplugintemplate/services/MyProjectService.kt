package com.github.hzy1992.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.hzy1992.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
