SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "1f42e0f1e0370a42fd01dcff7fa1bf2a"
SRC_URI[sha256sum] = "22ceaa283df60defdef9f51da568375bf42ec9ddd74fc3bfd7e519f867c69b89"
