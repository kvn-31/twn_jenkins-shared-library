#!/usr/bin/env groovy

import com.example.Docker

def call() {
    return new Docker(this).dockerLogin()
}
