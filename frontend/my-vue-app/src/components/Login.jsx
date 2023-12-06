import { Box, Grid } from "@mui/material";
import { LoginForm } from "./LoginForm";



export default function Login(){
    return <Box sx={{ flexGrow: 1 }} >
        <Grid container spacing={2} minHeight={'100vh'} justifyContent="center" alignItems="center">
           
            <Grid display="flex" justifyContent="center" alignItems="center">
                
                <LoginForm></LoginForm>
            </Grid>
            
        </Grid>
    </Box>
}