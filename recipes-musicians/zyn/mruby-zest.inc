SUMMARY = "Zyn-Fusion User Interface"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = " \
    gitsm://github.com/mruby-zest/mruby-zest-build.git \
    file://0001-mruby-Align-build-to-our-needs.patch \
    file://0002-mruby-zest-Align-build-to-our-needs.patch \
    file://0003-src-osc-bridge-Align-build-to-our-needs.patch \
"
SRCREV = "b312953ba991b15d1076ba819ca5a44ed4386b28"
PV = "3.02+git${SRCPV}"
S = "${WORKDIR}/git"

DEPENDS += " \
    ruby-native \
    bison-native \
"

CLEANBROKEN = "1"
