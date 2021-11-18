SUMMARY = "GUI frontend for sudo/su"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "liblxqt"

SRCREV = "f8eff1060cd1e738f6b70d5dafdc61bd61a3e3d6"
PV = "1.0.0"
