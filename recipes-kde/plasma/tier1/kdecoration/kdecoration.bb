SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "4dcab3dcedbcaf08556d23df10103a14"
SRC_URI[sha256sum] = "60e5f0c1d423710b93728ec0c4c5a754725ef933a1cf11fc9c7d8206540d57be"
