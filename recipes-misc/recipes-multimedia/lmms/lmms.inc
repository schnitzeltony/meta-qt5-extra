SUMMARY = "Qt based sequencer"
HOMEPAGE = "https://lmms.io"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "gitsm://github.com/LMMS/${BPN}.git;branch=stable-1.2"
SRCREV = "a2685c1cca3ef20e317d69eccb915f9d7b05e349"
S = "${WORKDIR}/git"
PV = "1.2.0-rc7+git${SRCPV}"
