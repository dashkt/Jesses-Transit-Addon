package org.eu.awesomekalin.jta.mod.blocks.directional;

import org.eu.awesomekalin.jta.mod.init.BlockEntityTypeInit;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;

public class UKBritishOperatorStationSignPoleBase extends RustyPoleBase implements BlockWithEntity
{

    private final Boolean isWhite;

    public UKBritishOperatorStationSignPoleBase(boolean white) {
        super();
        isWhite = white;
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (isWhite) return new TileEntityBritishRailOperatorSignWhite(blockPos, blockState); else return new TileEntityBritishRailOperatorSign(blockPos, blockState);
    }

    public static class TileEntityBritishRailOperatorSign extends BlockEntityExtension {

        public TileEntityBritishRailOperatorSign(BlockPos pos, BlockState state) {
            super(BlockEntityTypeInit.RUSTY_UK_BRITISH_OPERATOR_STATION_SIGN_BASE.get(), pos, state);
        }

        public boolean shouldRender() {
            return true;
        }
    }//Yes! Spam!

    public static class TileEntityBritishRailOperatorSignWhite extends BlockEntityExtension {

        public TileEntityBritishRailOperatorSignWhite(BlockPos pos, BlockState state) {
            super(BlockEntityTypeInit.RUSTY_UK_BRITISH_OPERATOR_STATION_SIGN_BASE_WHITE.get(), pos, state);
        }

        public boolean shouldRender() {
            return true;
        }
    }
}
