SUMMARY = "GUI frontend for sudo/su"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "liblxqt"

SRCREV = "ac5a06129228a29cf61d0ddb9e8dab9d6a36508a"
PV = "0.16.0"
