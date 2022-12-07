def newDownload(repo)
{
   git "https://github.com/viky9966/${repo}"
}

def newBuild()
{
   sh 'mvn package'
}

def newDeploy(jobname,ip,appname)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}

def runSelenium(jobname)
{
sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
} 
