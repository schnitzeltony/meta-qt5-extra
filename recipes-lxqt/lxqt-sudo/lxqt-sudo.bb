SUMMARY = "GUI frontend for sudo/su"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "liblxqt"

SRCREV = "d44df58bc47c3036ef522736de60a888ea97e432"
PV = "1.4.0"
