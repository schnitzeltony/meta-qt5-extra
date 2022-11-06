SUMMARY = "GUI frontend for sudo/su"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "liblxqt"

SRCREV = "64ec40132c40e9bc1b24e542f52de9b110c9c341"
PV = "1.2.0"
