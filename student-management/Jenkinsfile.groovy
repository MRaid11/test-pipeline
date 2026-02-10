pipeline {
    agent any 
    tools{
        maven "M2_Home"
        jdk "JAVA_Home"
    }
    stages{
        stage('Checkout'){
            steps{
                git branch: 'main',
                url: 'https://github.com/MRaid11/test-pipeline.git'
            }
        }
        stage('Build'){
            steps{
                sh  "mvn clean package -Dmaven.test.skip=true" 
            }
        }
    }
}