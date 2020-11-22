SUMMARY = "raw image decoder"
LICENSE = "LGPL-2.1 | CDDL-1.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=49dc9ed77b52e7fb5a619e055be195f3"

SRC_URI = "git://github.com/LibRaw/LibRaw.git;branch=0.19-stable"
SRCREV = "beeb572687270d49c16734c9ca620982151dbeff"
S = "${WORKDIR}/git"
PV = "0.19.5"

inherit autotools pkgconfig

DEPENDS = "jpeg jasper lcms"
