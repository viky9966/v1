
def newdown(a)
{
git "https://github.com/viky9966/${a}"
}

def build()
{
sh 'mvn package'
}

def deploy(filename,ip,appname)
{
sh "scp /var/lib/jenkins/workspace/${filename}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}

def selenium(filename)
{
sh "java -jar /var/lib/jenkins/workspace/${filename}/testing.jar"
}
