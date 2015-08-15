SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cfd83c271590f9e627fafd3a2a0420c7"
SRC_URI[sha256sum] = "b50f3c2938aa27dc15a64a994a4318c198b77577a6c56a467dec6474a38af9c7"
