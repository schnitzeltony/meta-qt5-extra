SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "51ae529769e7e8566de5c542f264bde2"
SRC_URI[sha256sum] = "5d722b38e5d28c4b8635ff8a029f6061ffa83858316b0aa40adf4d40f7b77bf5"
