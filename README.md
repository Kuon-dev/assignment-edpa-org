# Assignment EPDA
This is an assignment provided by Asia Pacific University.

# Installation
1. Ensure `pnpm` and `java` is installed.
```bash
pnpm -v
8.15.1
java -v
// openjdk 21.0.1 2023-10-17
// OpenJDK Runtime Environment (build 21.0.1+12-29)
// OpenJDK 64-Bit Server VM (build 21.0.1+12-29, mixed mode, sharing)
```
2. Clone repo
```bash
git clone https://github.com/Kuon-dev/assignment-edpa-org.git -b template
```

3. Remove origin
```bash
git remote remove origin
```

4. Add your new origin
```bash
git remote origin add <your-github-repo-url>
```

5. Create a new file called `.env` file located at `./src/main/resources/`. So it should be located at `./src/main/resources/.env`. Put the values
of examples based on `.env.example`

6. Start app. This will be your daily workflow. 
```bash
./gradlew bootRun
```

## Extra note:
`Note: ` Ensure your db server (postgres, mysql etc) is running.
Adding new dependencies requires a new build
```bash
./gradlew clean build --refresh-depedencies
```
