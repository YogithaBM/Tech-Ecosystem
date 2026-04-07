package com.thinkworks.techecosystem.runner;

import com.sun.deploy.security.BlacklistedCerts;
import com.thinkworks.techecosystem.base.Entity;
import com.thinkworks.techecosystem.sub.*;

import javax.xml.crypto.Data;

public class MainRunner {
    public static void main(String[] args) {
        Entity entity1=new Developer(43,"Ilya",82736.4D);
        if(entity1 instanceof Developer){
            Developer developer=(Developer) entity1;
            developer.writeCode();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity2=new Tester(6232,"Shane",8294D);
        if(entity2 instanceof Tester){
            Tester tester=(Tester) entity2;
            tester.testerSoftware();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity3=new Manager(2672,"Scott",8456.93D);
        if(entity3 instanceof Manager){
            Manager manager=(Manager) entity3;
            manager.managing();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity4=new DevOps(978,"Kip",7687.3D);
        if(entity4 instanceof DevOps){
            DevOps devOps=(DevOps) entity4;
            devOps.deployApplication();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity5=new Intern(8346,"Rose",4565.3D);
        if (entity5 instanceof Intern){
            Intern intern=(Intern) entity5;
            intern.assistTeam();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity6=new Designer(564,"Yuna",634.7D);
        if(entity6 instanceof Designer){
            Designer designer=(Designer) entity6;
            designer.creatingDesign();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity7=new DataEngineer(2523,"Svetlana",732.5D);
        if(entity7 instanceof DataEngineer){
            DataEngineer dataEngineer=(DataEngineer) entity7;
            dataEngineer.buildPipeline();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity8=new AIEngineer(7524,"Elena",34565.7D);
        if(entity8 instanceof AIEngineer){
            AIEngineer aiEngineer=(AIEngineer) entity8;
            aiEngineer.trainModel();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity9=new SecurityEngineer(3546,"Hayden",3756.3D);
        if(entity9 instanceof SecurityEngineer){
            SecurityEngineer securityEngineer=(SecurityEngineer) entity9;
            securityEngineer.performSecurityAudit();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity10=new CloudEngineer(7543,"Conner",8345.3D);
        if(entity10 instanceof CloudEngineer){
            CloudEngineer cloudEngineer=(CloudEngineer)entity10;
            cloudEngineer.manageCloudInfrastructure();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity11=new SupportEngineer(3476,"Hudson",8374.4D);
        if(entity11 instanceof SecurityEngineer){
            SecurityEngineer securityEngineer=(SecurityEngineer) entity11;
            securityEngineer.performSecurityAudit();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity12=new HR(3564,"William",23475.6D);
        if(entity12 instanceof HR){
            HR hr=(HR) entity12;
            hr.conductInterviews();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity13=new Recruiter(6534,"Robbie",64564.4D);
        if(entity13 instanceof Recruiter){
            Recruiter recruiter=(Recruiter) entity13;
            recruiter.hireCandidate();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity14=new ProductManager(534,"Miles",65264D);
        if(entity14 instanceof ProductManager){
            ProductManager productManager=(ProductManager) entity14;
            productManager.defineProductStrategy();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity15=new BusinessAnalyst(7634,"Elio",76352.9D);
        if(entity15 instanceof BusinessAnalyst){
            BusinessAnalyst businessAnalyst=(BusinessAnalyst) entity15;
            businessAnalyst.analyseRequirements();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity16=new SystemAdmin(635,"Daniela",80634D);
        if(entity16 instanceof SystemAdmin){
            SystemAdmin systemAdmin=(SystemAdmin) entity16;
            systemAdmin.maintainServers();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity17=new NetworkEngineer(9364,"David",8360.5D);
        if(entity17 instanceof NetworkEngineer){
            NetworkEngineer networkEngineer=(NetworkEngineer) entity17;
            networkEngineer.configureNetwork();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity18=new QAEngineer(51624,"Storrie",7238.7D);
        if(entity18 instanceof QAEngineer){
            QAEngineer qaEngineer=(QAEngineer) entity18;
            qaEngineer.ensuringQuality();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity19=new AutomationEngineer(7753,"Rozanov",723243.8D);
        if(entity19 instanceof AutomationEngineer){
            AutomationEngineer automationEngineer=(AutomationEngineer)entity19;
            automationEngineer.writeScripts();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity20=new MobileDeveloper(625,"Hollander",97834D);
        if(entity20 instanceof MobileDeveloper){
            MobileDeveloper mobileDeveloper=(MobileDeveloper)entity20;
            mobileDeveloper.developMobileApp();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity21=new FrontendDeveloper(715,"Potter",8124.90D);
        if(entity21 instanceof FrontendDeveloper){
            FrontendDeveloper frontendDeveloper=(FrontendDeveloper) entity21;
            frontendDeveloper.designUI();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity22=new BackendDeveloper(7624,"Kaden",87366.4D);
        if(entity22 instanceof BackendDeveloper){
            BackendDeveloper backendDeveloper=(BackendDeveloper) entity22;
            backendDeveloper.buildAPI();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity23=new FullstackDeveloper(624,"Brandon",87938.3D);
        if(entity23 instanceof FullstackDeveloper){
            FullstackDeveloper fullstackDeveloper=(FullstackDeveloper) entity23;
            fullstackDeveloper.handleFrontendAndBackend();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity24=new TechnicalWriter(3566,"Christina",37647.43D);
        if(entity24 instanceof TechnicalWriter){
            TechnicalWriter technicalWriter=(TechnicalWriter) entity24;
            technicalWriter.writeDocumentation();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity25=new Consultant(6444,"Dylan",82447.32D);
        if(entity25 instanceof Consultant){
            Consultant consultant=(Consultant) entity25;
            consultant.provideSolution();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity26=new Designer(734,"Maanya",847.342D);
        if(entity26 instanceof Designer) {
            Consultant consultant1 = (Consultant) entity26;
            consultant1.displayDetails();
        }
        else{
            System.out.println("Invalid casting");
        }


        Entity entity27=new Manager(3654,"Mikkel",64583.4D);
        if(entity27 instanceof Manager) {
            Tester tester1 = (Tester) entity27;
            tester1.testerSoftware();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity28=new FullstackDeveloper(3254,"Sindhu",44663.5D);
        if(entity28 instanceof FullstackDeveloper) {
            BackendDeveloper backendDeveloper2 = (BackendDeveloper) entity28;
            backendDeveloper2.displayDetails();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity29=new BlockchainEngineer(364,"Ambani",38346.5D);
        if(entity29 instanceof BlockchainEngineer){
            BlockchainEngineer blockchainEngineer=(BlockchainEngineer) entity29;
            blockchainEngineer.blockChaining();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity30=new DataScientist(533,"Hana",8325.4D);
        if(entity30 instanceof DataScientist){
            DataScientist dataScientist =(DataScientist) entity30;
            dataScientist.analyzeData();
        }
        else{
            System.out.println("Invalid casting");
        }

        Entity entity31=new GameDeveloper(3734,"Elsa",3875.45D);
        if(entity31 instanceof GameDeveloper){
            GameDeveloper gameDeveloper=(GameDeveloper)entity31;
            gameDeveloper.gaming();
        }
        else{
            System.out.println("Invalid casting");
        }








    }

}
