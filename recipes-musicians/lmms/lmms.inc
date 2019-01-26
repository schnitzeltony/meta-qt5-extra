SUMMARY = "Qt based sequencer"
HOMEPAGE = "https://lmms.io"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "gitsm://github.com/LMMS/${BPN}.git;branch=stable-1.2"
SRCREV = "d8fb07ff52ee87a290ad7e69d0851cfb1c20d261"
S = "${WORKDIR}/git"
PV = "1.2.0-rc7+git${SRCPV}"
