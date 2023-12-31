plugins {
    id("java")
    id("application")
}
application {
    mainClass.set("Application")
}

group = "com.SheilaAlbino.hero"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/com.googlecode.lanterna/lanterna
    implementation(group= "com.googlecode.lanterna", name= "lanterna", version= "3.2.0-alpha1")

}

tasks.test {
    useJUnitPlatform()
}