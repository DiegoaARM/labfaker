[![CI/CD Pipeline](https://github.com/DiegoaARM/labfaker/actions/workflows/build.yml/badge.svg)](https://github.com/DiegoaARM/labfaker/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=bugs)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=coverage)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=DiegoaARM_labfaker&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=DiegoaARM_labfaker)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
