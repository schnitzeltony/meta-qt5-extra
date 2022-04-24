SUMMARY = "GUI frontend for sudo/su"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "liblxqt"

SRCREV = "a4650a5b3d4f60406ef62e215b8b003c45d21f77"
PV = "1.1.0"
