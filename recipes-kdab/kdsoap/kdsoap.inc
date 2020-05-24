SUMMARY = "A Qt-based client-side and server-side SOAP component"
LICENSE = "(GPLv2 & LGPLv2.1 & AGPL-3.0) | KDAB-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL.txt;md5=63e3028b49eac8f84ab29661f079f159 \
    file://LICENSE.LGPL.txt;md5=ce198ec102c2f0b1d13f26967a934670 \
    file://LICENSE.AGPL3-modified.txt;md5=6b6dcd83ea786a77851d959c2797f78c \
    file://LICENSE.txt;md5=a0def7eadd11e7a9916a16e5d8bc1a82 \
"

inherit cmake_qt5

SRC_URI = "git://github.com/KDAB/KDSoap.git;protocol=https"
SRCREV = "fb0e905e242c2044fd25683a406eb6d369db052f"
S = "${WORKDIR}/git"
PV = "1.9.0"
