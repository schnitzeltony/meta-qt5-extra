SUMMARY = "GUI frontend for sudo/su"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "liblxqt"

SRCREV = "751547ea94fc57b080ab51b0d024e12bde6bd2c2"
PV = "0.17.0"
