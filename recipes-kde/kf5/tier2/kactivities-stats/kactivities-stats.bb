SUMMARY = "A library for accessing the usage data collected by the activities system"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = " \
	file://COPYING.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
	file://COPYING.LGPL-2.1;md5=4fbd65380cdd255951079008b364516c \
	file://COPYING.LGPL-3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit kde-kf5

DEPENDS += " \
    boost \
    kconfig \
    kconfig-native \
    kactivities \
"

# Workaround
# default_constructible_unary_fn.hpp:38:9: error: no match for 'operator==' (operand types are 'const boost::optional<std::_Bind<ActivityInfo (Activities::*(const Activities*, std::_Placeholder<1>))(const QString&) const> >' and 'int')
CXXFLAGS += "-DBOOST_DISABLE_ASSERTS"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0142a60eebc6dee4b5a5c4705e4c5761"
SRC_URI[sha256sum] = "fb645db4685113dfd98834f48d8941529fee53d5e26ec5e36cfee8a9bfae97ae"
