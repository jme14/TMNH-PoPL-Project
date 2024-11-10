## Prereqs
1) antlr4 
2) nodejs 
3) java

## Setup
1) `git clone (this repo)`
2) `npm install` 
    (this reads the package.json file and downloads the proper npm modules)
3) `npm install --save-dev @types/node` (adds in definitions for node)
4) `antlr4 -Dlanguage=TypeScript -o generated TMNH.g4` OR `npm run build`
5) `npm run start` OR `tsc parseFiles.ts && node parseFiles.js`