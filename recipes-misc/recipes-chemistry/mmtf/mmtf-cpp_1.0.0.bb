SUMMARY = "The pure C++ implementation of the MMTF API, decoder and encoder"
HOMEPAGE = "https://github.com/rcsb/mmtf-cpp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7be9bbf9f4ec4ed1e36494b29561af1e"

inherit cmake

DEPENDS = "msgpack-c"

SRC_URI = "git://github.com/rcsb/mmtf-cpp.git"
SRCREV = "407bf8e541530579b1f2c3e7f7fa96bb06ef5be9"
S = "${WORKDIR}/git"

RDEPENDS:${PN} += "msgpack-c"
