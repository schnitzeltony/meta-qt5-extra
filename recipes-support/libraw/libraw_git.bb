SUMMARY = "raw image decoder"
LICENSE = "LGPLv2.1 | CDDL-1.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=49dc9ed77b52e7fb5a619e055be195f3"

SRC_URI = "git://github.com/LibRaw/LibRaw.git;branch=0.19-stable"
SRCREV = "3a5280c6d69458a21bd9756d2ee32847380da995"
S = "${WORKDIR}/git"
PV = "0.19.2"

inherit autotools pkgconfig

DEPENDS = "jpeg jasper lcms"
