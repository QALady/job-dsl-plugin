package javaposse.jobdsl.dsl.helpers.step

import javaposse.jobdsl.dsl.helpers.Context

class RakeContext implements Context {
    List<String> tasks = []
    String file = ''
    String installation = '(Default)'
    String libDir = ''
    String workingDir = ''
    boolean bundleExec = false
    boolean silent = false

    def task(String task) {
        tasks << task
    }

    def tasks(Iterable<String> addlTasks) {
        addlTasks.each {
            task(it)
        }
    }

    String getTasksString() {
        tasks.join(' ')
    }

    def file(String file) {
        this.file = file
    }

    def installation(String installation) {
        this.installation = installation
    }

    def libDir(String libDir) {
        this.libDir = libDir
    }

    def workingDir(String workingDir) {
        this.workingDir = workingDir
    }

    def bundleExec(boolean bundleExec) {
        this.bundleExec = bundleExec
    }

    def silent(boolean silent) {
        this.silent = silent
    }
}
