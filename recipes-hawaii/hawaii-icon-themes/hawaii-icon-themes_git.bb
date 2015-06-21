SUMMARY = "Icon themes for the Hawaii desktop environment"
LICENSE = "LGPLv3 | CC-BY-SA-3.0"
LIC_FILES_CHKSUM = " \
    file://src/cursors/COPYING;md5=c84cac88e46fc07647ea07e6c24eeb7c \
    file://src/cursors/COPYING_CCBYSA3;md5=96143d33de3a79321b1006c4e8ed07e7 \
    file://src/cursors/COPYING_LGPL;md5=e6a600fd5e1d9cbde2d983680233ad02 \
    file://src/symbolic/COPYING;md5=c84cac88e46fc07647ea07e6c24eeb7c \
    file://src/symbolic/COPYING_CCBYSA3;md5=96143d33de3a79321b1006c4e8ed07e7 \
    file://src/symbolic/COPYING_LGPL;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit hawaii

SRCREV = "1ff24655d3881762294e9dde4a83770e6ff80c3b"
PV = "0.4.0+git${SRCPV}"
S = "${WORKDIR}/git"

PACKAGE_ARCH = "all"

FILES_${PN} += "${datadir}/icons"
