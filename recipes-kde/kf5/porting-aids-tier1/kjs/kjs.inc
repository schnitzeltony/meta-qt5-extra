SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7aa8b37c1fd45b61d3a267f65ea32d14"
SRC_URI[sha256sum] = "74eb9b56291893c42d295cfec0141eba166c9ed40e777ee8bb1e1c272799daec"
