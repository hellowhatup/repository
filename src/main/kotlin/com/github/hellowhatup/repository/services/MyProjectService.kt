package com.github.hellowhatup.repository.services

import com.intellij.openapi.project.Project
import com.github.hellowhatup.repository.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
