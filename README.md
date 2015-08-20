# SAMI sample code for an IoT system to remotely monitor fire and temperature with SAMI

Build a remote fire and temperature monitoring system using SAMI, off-the-shelf sensors, Arduino Uno, Raspberry Pi, and an Android application. 

Introduction
-------------

The blog post [Build an IoT system to remotely monitor fire and temperature with SAMI](https://blog.samsungsami.io/mobile/development/2015/04/09/???.html) at http://blog.samsungsami.io/ describes what the system does and how it is implemented.

Check out [Demo video.](https://blog.samsungsami.io/mobile/development/2015/04/09/???.html#)

This repository contains the following software:

 - A [Sketch](https://www.arduino.cc/en/Guide/Environment#toc2) program in `arduino` directory. Consult [Step 2: Set up the Arduino](//todo#step-2-set-up-the-arduino) in the blog to set up the board and load the program to the board.
 - A Node.js script in `raspberrypi` directory. Consult [Step 3: Set up the Raspberry Pi](//todo#step-3-set-up-the-raspberry-pi) in the blog to install the packages and run the script on the Pi.
 - An Android application running on the Android phone. Blow we give the prerequisites, and installation instructions. 

Prerequisites for Android Application
-------------

 * [TooTallNate Java WebSockets](https://github.com/TooTallNate/Java-WebSocket)
 * Android SDK v21
 * Android Build Tools v21.1.1
 * Android Studio 1.0.1

Setup and Installation for Android Application
----------------------

1. Download and build [Java WebSockets](https://github.com/TooTallNate/Java-WebSocket). Copy `java_websocket.jar` to `app/libs`.
2. Import as an existing Android Studio project in Android Studio IDE.
3. If you have not connected the IoT system as a device in the SAMI User Portal, please consult [Step 1](//link_to_blog#step-1-connect-a-device-in-the-sami-user-portal) in the blog post. In the [User Portal](https://portal.samsungsami.io), click the Settings icon of the your device. In the pop-up, get the device ID and token to replace `YOUR DEVICE ID` and `YOUR DEVICE TOKEN` in `SAMISession.java`.
4. Build the app and deploy APK into your Android phone

Sketch Program for Arduino Uno Board
-------------

The code is located in `arduino` directory. Consult [Step 2: Set up the Arduino](//todo#step-2-set-up-the-arduino) in the blog to set up the board and load the program to the board.

Nodejs Program for Raspberry Pi
-------------

The code is located in `raspberrypi` directory. Consult [Step 3: Set up the Raspberry Pi](//todo#step-3-set-up-the-raspberry-pi) in the blog to install the packages and to run the program on the Pi.


More about SAMI
---------------

If you are not familiar with SAMI, we have extensive documentation at http://developer.samsungsami.io

The full SAMI API specification with examples can be found at http://developer.samsungsami.io/sami/api-spec.html

Peek into advanced sample applications at https://developer.samsungsami.io/sami/samples/

To create and manage your services and devices on SAMI, visit developer portal at http://devportal.samsungsami.io

License and Copyright
---------------------

Licensed under the Apache License. See LICENSE.

Copyright (c) 2015 Samsung Electronics Co., Ltd.
