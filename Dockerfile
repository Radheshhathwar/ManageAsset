FROM openjdk:11
WORKDIR C:/Users/test/IdeaProjects/ManageAsset/src/main/java/com/tarento/assetManagement
RUN javac Application.java
CMD ["java", "Application"]
EXPOSE 8084