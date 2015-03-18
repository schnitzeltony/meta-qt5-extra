SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a4ca427862d70bd748b1c49f50b9d43b"
SRC_URI[sha256sum] = "7f22da120ac14ea1c4fcbb1a099b07dbfb5ef9fabeebf0693eb2d5866a0bc577"
