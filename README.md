# Process Oriented Text Generation Prototype

> Business process descriptions are useful documents that are becoming increasingly important for identifying and documenting business processes. They are particularly beneficial during discovery when information about the process is gathered in interviews or by observation. As natural language descriptions are intrinsically ambiguous, it is the major challenge to formulate them in a precise and correct way right from the start. 

A service-oriented architecture prototype that analyzes a process description written in natural language and generate a sound process description. A sound process description is structured, has less ambiguity, reveals possible quality and soundness problems related to BPMN 2.0, and contains clear identifiers for all known process elements in the text.

---

## Requirements
- [IntelliJ IDEA 2017.1](https://www.jetbrains.com/idea/download/) or higher
- [GlassFish Server 5.0](http://download.oracle.com/glassfish/5.0/release/glassfish-5.0.zip) or higher
- [Git](https://github.com/sitepoint-editors/ginit)

## Get Started

1. Download and install all the listed softwares above
2. Clone this repository
3. Open IntelliJ IDEA and browse for the MainService, ServiceRegistry and the desired services's folders
4. Note that you have to open an Intellij IDEA instance for each project in order to compile and run it

---

### Configure GlassFish Server

1. Open the `Settings / Preferences` Dialog by pressing `Ctrl+Alt+S` and click **Application Servers** under Build, Execution, Deployment
2. On the `Application Servers` page that opens, click on the `+` icon above the central pane and choose **GlassFish Server** from the list
3. In the right-hand pane, specify the GlassFish Server installation folder in the GlassFish Home field. Type the path to it manually or click ate the browse button `...` and choose the installation folder in the dialog box that opens 
4. The other fields are filled automatically or are optional, so just click **OK**

---

### Configure JDK

1. Press `Ctrl+Shift+Alt+S` or choose File | Project Structure on the main menu
2. In the Project Structure Dialog that opens, choose **SDKs** under the Platform Settings
3. On the SDKs page that opens, click in the add button `+` above the central pane and choose **JDK**
4. In the right-hand pane, specify the installation folder of the **Java SE Development Kit (JDK)** to use. Type the path manually or click in the browse button `...` and choose the installation folder in the dialog that opens
5. All the mandatory fields in the other tabs are filled in automatically, so just click **OK**

---

### Instalation

1. Open a service's project
2. Enable Maven Auto Import
3. Open Maven Dependencies at top right panel
4. At `Service Folder's Name / Plugins`, run the plugin `cxf-wadl2java`
5. Build and Run project

> **Note 1**: If you are configuring MainService, you will have to do x more steps before Build and Run project.
1. Click in **Edit Configurations** button (right side of Build button)
2. Choose `Templates / GlassFish Server / Local`
3. Bind Application Server to your downloaded GlassFish Server
4. Set Open Broser URL field to http://localhost:8080/bpmparser/
5. Set Server Domain field to **domain1**
6. Set Username field to **admin** and leave Password field empty
7. Click in the Fix button at bottom right of the dialog box
8. In Artifacts Panel, select `Web Application: Exploded / From modules` and choose **mainService**
9. At Deployment tab, check `Use custom context root` and set it to **/bpmparser**
10. Navigate to Facets panel and create a new Web Facet
11. Chose all Available Elements but **Maven: joda-time:joda-time:2.9.4**

Now the GlassFish server is configured and ready to run the application. Build and Run it.

> **Note 2**: By default, the MainService runs at http://localhost:8080 and ServiceRegistry at http://localhost:8090

---

### More Examples and Tutorials

- [JetBrains - Developing Web Applications](https://www.jetbrains.com/help/idea/developing-web-applications.html)
- [JetBrains - Creating and Running Your First RESTful Web Service on GlassFish Application Server](https://www.jetbrains.com/help/idea/creating-and-running-your-first-restful-web-service.html)

## Services

- [Main Service](MainService)
- [Service Registry](ServiceRegistry)
- [Text Reader Service](TextReaderService)
- [Text Writer Service](TextWriterService)
- [Process Verification Service](ProcessVerificationService)

## Credits
1. [Thanner Soares Silva](mailto:thanner.silva@inf.ufrgs.br) | Institute of Informatics - Federal Univ. of Rio Grande do Sul
2. [Diego Toralles Avila](mailto:dtavila@inf.ufrgs.br) | Institute of Informatics - Federal Univ. of Rio Grande do Sul
3. [Jean Ampos Flesch](mailto:jaflesch@inf.ufrgs.br) | Institute of Informatics - Federal Univ. of Rio Grande do Sul
4. [Sarajane Marques Peres](mailto:sarajane@usp.br) | School of Arts, Sciences and Humanities - University of Sao Paulo
5. [Jan Mendling](mailto:jan.mendling@wu.ac.at) | Institute for Information Business - Vienna Univ. of Economics and Business
6. [Lucineia Heloisa Thom](mailto:lucineia@inf.ufrgs.br) | Institute of Informatics - Federal Univ. of Rio Grande do Sul

