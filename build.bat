@echo off

cls

rmdir /Q /S output

mkdir output\mlib

dir /s /b *.java > output\files.txt

findstr api output\files.txt > output\api.txt

javac @output\api.txt -d output\classes

jar -c -f output/mlib/api.jar -C output\classes .

rmdir /Q /S output\classes

jar -f output/mlib/api.jar -d

findstr impl output\files.txt > output\impl.txt

javac -p output\mlib @output\impl.txt -d output\classes

jar -c -f output/mlib/impl.jar -p output/mlib -C output\classes .

jar -f output/mlib/impl.jar -d

rmdir /Q /S output\classes

findstr client output\files.txt > output\client.txt

javac -p output\mlib @output\client.txt -d output\classes

jar -c -f output/mlib/client.jar -p output/mlib -C output\classes .

jar -f output/mlib/client.jar -d

java -p output/mlib -m client/edu.chinna.kadhira.client.Client