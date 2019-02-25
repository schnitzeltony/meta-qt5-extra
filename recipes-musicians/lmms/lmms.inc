SUMMARY = "Qt based sequencer"
HOMEPAGE = "https://lmms.io"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "gitsm://github.com/LMMS/${BPN}.git;branch=stable-1.2"
SRCREV = "55eb831507250b236de80e63d376083dde0b3ae1"
S = "${WORKDIR}/git"
PV = "1.2.0~rc8+git${SRCPV}"
