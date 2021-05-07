SUMMARY = "The standalone LXQt "About" dialog"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += " \
    liblxqt \
"

SRCREV = "1c4a3060f1f4377d76d80acfa103677c95887b06"
PV = "0.17.0"
