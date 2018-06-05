SUMMARY = "Qt based sequencer"
HOMEPAGE = "https://lmms.io"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "gitsm://github.com/LMMS/${BPN}.git;branch=stable-1.2"
SRCREV = "2f19fa11c886374adcc74990e52d3ed0473fbf08"
S = "${WORKDIR}/git"
PV = "1.2.0-rc6+git${SRCPV}"
